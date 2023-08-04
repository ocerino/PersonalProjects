# -*- coding: utf-8 -*-
"""
Created on Mon Mar  1 22:04:59 2021

@author: lilos
"""

import pymongo 
from pymongo import MongoClient
import pprint

client=MongoClient()

db=client.testDB

for cursor in client.list_databases():
    print(cursor)

aSailor1={ "sid" : "1", "name" : "Sue", "age" : "22", "rating" : "7" }
aSailor2={ "sid" : "2", "name" : "Mary", "age" : "25", "rating" : "5" }
twoSailors=[aSailor1, aSailor2]
sailors=db.someSailors
sailors.insert_many(twoSailors)
for objs in sailors.find():
    pprint.pprint(objs)

