var db = db.getSiblingDB('Transportr');

db.dropDatabase();

db = db.getSiblingDB('Transportr');

db.areas.insert({ "name": "Kothrud", "lat": 18.5073985, "lng": 73.8076504});
db.areas.insert({"name": "Sahakarnagar", "lat": 13.0623425, "lng": 77.5871032});
db.areas.insert({"name": "Aundh", "lat": 18.558007, "lng": 73.80752009999999});
db.areas.insert({"name": "Baner", "lat": 18.5596581, "lng": 73.77993739999999});
db.areas.insert({"name": "Balewadi", "lat": 18.5788913, "lng": 73.7706807});
db.areas.insert({"name": "Hinjewadi", "lat": 18.597059, "lng": 73.7188233});
db.areas.insert({"name": "Wagholi", "lat": 17.9, "lng": 74.083});
db.areas.insert({"name": "Shivajinagar", "lat": 16.6775742, "lng": 76.50999689999999});
db.areas.insert({"name": "Bhosalenagar", "lat": 17.0429399, "lng": 74.7263913});
db.areas.insert({ "name": "Law College Road", "lat": 18.5142973, "lng": 73.82874959999999});
db.areas.insert({ "name": "Pimpri", "lat": 18.6297811, "lng": 73.7997094});
db.areas.insert({ "name": "Kondhwa", "lat": 18.4770906, "lng": 73.89068689999999});
db.areas.insert({ "name": "Katraj", "lat": 18.4575324, "lng": 73.8677464});

db.vehicleTypes.insert({"name": "Trailer"});
db.vehicleTypes.insert({"name": "Tempo"});
db.vehicleTypes.insert({"name": "Pickup"});
db.vehicleTypes.insert({"name": "Tipper"});
db.vehicleTypes.insert({"name": "Container"});
db.vehicleTypes.insert({"name": "Tractor"});
db.vehicleTypes.insert({"name": "Refigerated"});
db.vehicleTypes.insert({"name": "Tanker"});
db.vehicleTypes.insert({"name": "Flatbed"});
db.vehicleTypes.insert({"name": "6 Wheel Truck"});
db.vehicleTypes.insert({"name": "10 Wheel Truck"});
db.vehicleTypes.insert({"name": "12 Wheel Truck"});


db.vehicles.insert({ "vehicleNo": "MH12 AJ142" ,
    "area": "Balewadi",  "rating" :"3", "vehicleTypeId" : 2, "vehicleType" : "Tempo"});

db.vehicles.insert({"vehicleNo": "MH12 BK1426" ,
     "area": "Kothrud",  "rating" :"3", "vehicleTypeId" : 3, "vehicleType" : "Pickup"});

db.vehicles.insert({"vehicleNo": "MH12 AM4542" ,
     "area": "Aundh",  "rating" :"3", "vehicleTypeId" : 6, "vehicleType" : "Tractor"});

db.vehicles.insert({"vehicleNo": "MH12 GR1212" ,
     "area": "Shivajinagar",  "rating" :"3", "vehicleTypeId" : 2, "vehicleType" : "Tempo"});

db.vehicles.insert({"vehicleNo": "MH12 KL8999" ,
     "area": "Wagholi",  "rating" :"3", "vehicleTypeId" : 2, "vehicleType" : "Tempo"});

db.vehicles.insert({"vehicleNo": "MH12 PL1426" ,
     "area": "Pimpri",  "rating" :"3", "vehicleTypeId" : 3, "vehicleType" : "Pickup"});



