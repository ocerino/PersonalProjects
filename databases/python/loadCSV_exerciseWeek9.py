# look for "REPLACE" to see what you need to change -> 3 occurences need replaced
#!/usr/bin/env python
import os
import pandas as pd
import pymongo
import json


def import_content(filepath):
	mng_client = pymongo.MongoClient('localhost', 27017)
	mng_db = mng_client['db_csv'] # REPLACE mongo db name with desired name
	collection_name = 'theEmps' # REPLACE mongo collection name with desired 
	db_cm = mng_db[collection_name]
	cdir = os.path.dirname(__file__)
	file_res = os.path.join(cdir, filepath)

	data = pd.read_csv(file_res)  # read csv file into pandas
	data_json = json.loads(data.to_json(orient='records'))  # convert to list of json objects 
	db_cm.delete_many({})  # if collection exists, remove it so do not add to existing
	db_cm.insert_many(data_json)  # insert the json documents contained in data_json

if __name__ == "__main__":   # begin execution here if this program called instead of imported
	filepath = 'O:/School work/comp sci/databases/python/empData.csv' # REPLACE with desired file path/name 
	import_content(filepath)
