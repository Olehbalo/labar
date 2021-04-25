from flask import Flask, request, jsonify
from flask_sqlalchemy import SQLAlchemy
from flask_marshmallow import Marshmallow
from marshmallow import fields
from flask import abort
import sqlite3


app = Flask(__name__)

app.config['SQLALCHEMY_DATABASE_URI'] = 'mysql+mysqlconnector://oleh:lenovog500@localhost/iotproject'

db = SQLAlchemy(app)
ma = Marshmallow(app)


class Athletics(db.Model):
    id = db.Column(db.Integer, primary_key=True)
    kind_of_sport = db.Column(db.String(20))
    number_of_players = db.Column(db.Integer)
    duration_of_competitions = db.Column(db.Integer)
    athletic_equipment = db.Column(db.String(40))
    jumping_style= db.Column(db.String(30))
    distance = db.Column(db.Integer)
    average_race_time = db.Column(db.Integer)
    
    def __init__(self, kind_of_sport, number_of_players, duration_of_competitions, athletic_equipment, jumping_style, distance, average_race_time):
        self.kind_of_sport = kind_of_sport 
        self.number_of_players = number_of_players
        self.duration_of_competitions = duration_of_competitions
        self.athletic_equipment = athletic_equipment
        self.jumping_style = jumping_style
        self.distance = distance
        self.average_race_time = average_race_time
    
    def update(self, kind_of_sport, number_of_players, duration_of_competitions, athletic_equipment, jumping_style, distance, average_race_time):
        self.__init__(kind_of_sport, number_of_players, duration_of_competitions, athletic_equipment, jumping_style, distance, average_race_time)

def get_athletics_by_id(id):
    athletics = Athletics.query.get(id)

    if not athletics:
        return abort(404)
    return athletics


class AthleticSchema(ma.Schema):
    kind_of_sport = fields.String()
    number_of_players = fields.Integer()
    duration_of_competitions = fields.Integer()
    athletic_equipment = fields.String()
    jumping_style= fields.String()
    distance = fields.Integer()
    average_race_time = fields.Integer()


athletics_schema = AthleticSchema()
athletic_schema = AthleticSchema(many=True)

@app.route('/athletics', methods=['POST'])
def add_athletics():
    fields = athletics_schema.load(request.json)
    new_athletics = Athletics(**fields)
    db.session.add(new_athletics)
    db.session.commit()

    return athletics_schema.jsonify(new_athletics)

@app.route('/athletics', methods=['GET'])
def get_athletic():
    all_athletic = Athletics.query.all()
    result = athletic_schema.dump(all_athletic)
    return athletic_schema.jsonify(result)

@app.route('/athletics/<id>', methods=['GET'])
def get_athletics(id):
    athletics = get_athletics_by_id(id)
    if not  athletics:
        abort(404)
    return athletics_schema.jsonify(athletics)



@app.route('/athletics/<id>', methods=['PUT'])
def update_athletics(id):
    athletics = get_athletics_by_id(id)
    fields = athletics_schema.load(request.json)
    athletics.update(**fields)

    if not athletics:
        abort(404)

    db.session.commit()
    return athletics_schema.jsonify(athletics)

@app.route('/athletics/<id>', methods=['DELETE'])
def delete_athletics(id):
    athletics = get_athletics_by_id(id)

    if not athletics:
        abort(404)

    db.session.delete(athletics)
    db.session.commit()
    return athletics_schema.jsonify(athletics)


if __name__ == '__main__':
    db.create_all()
    app.run(debug=True)
