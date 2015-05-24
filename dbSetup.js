var db = db.getSiblingDB('Transportr');

db.dropDatabase();

db = db.getSiblingDB('Transportr');

db.vendors.insert({"name": "Vinayak Kale", "vehicleNo": "MH12 AJ142" ,
    "phoneNo": "+917798292606", "area": "Katraj", "radius": "90"});

db.vendors.insert({"name": "Asif Khan", "vehicleNo": "MH12 CX8895" ,
    "phoneNo": "+919565218878", "area": "Kondhwa", "radius": "70"});

db.vendors.insert({"name": "Abhay Lokhande", "vehicleNo": "MH14 J2105" ,
    "phoneNo": "+918857063264", "area": "Wagholi", "radius": "100"});

db.vendors.insert({"name": "Tejas Sutar", "vehicleNo": "MH12 GR5165" ,
    "phoneNo": "+917876554269", "area": "Pimpri", "radius": "100"});

db.area.insert({"name": "Kothrud", "lat": 18.5073985, "lng": 73.8076504});
db.area.insert({"name": "Sahakarnagar", "lat": 13.0623425, "lng": 77.5871032});
db.area.insert({"name": "Aundh", "lat": 18.558007, "lng": 73.80752009999999});
db.area.insert({"name": "Baner", "lat": 18.5596581, "lng": 73.77993739999999});
db.area.insert({"name": "Balewadi", "lat": 18.5788913, "lng": 73.7706807});
db.area.insert({"name": "Hinjewadi", "lat": 18.597059, "lng": 73.7188233});
db.area.insert({"name": "Wagholi", "lat": 17.9, "lng": 74.083});
db.area.insert({"name": "Shivajinagar", "lat": 16.6775742, "lng": 76.50999689999999});
db.area.insert({"name": "Bhosalenagar", "lat": 17.0429399, "lng": 74.7263913});
db.area.insert({"name": "Law College Road", "lat": 18.5142973, "lng": 73.82874959999999});
db.area.insert({"name": "Pimpri", "lat": 18.6297811, "lng": 73.7997094});
db.area.insert({"name": "Kondhwa", "lat": 18.4770906, "lng": 73.89068689999999});
db.area.insert({"name": "Katraj", "lat": 18.4575324, "lng": 73.8677464});

db.vehicleType.insert({"name": "Trailer"});
db.vehicleType.insert({"name": "Tempo"});
db.vehicleType.insert({"name": "Pick-up"});
db.vehicleType.insert({"name": "Tipper"});
db.vehicleType.insert({"name": "Container"});
db.vehicleType.insert({"name": "Tractor"});
db.vehicleType.insert({"name": "Refigerated"});
db.vehicleType.insert({"name": "Tanker"});
db.vehicleType.insert({"name": "Flatbed"});
db.vehicleType.insert({"name": "6 Wheel Truck"});
db.vehicleType.insert({"name": "10 Wheel Truck"});
db.vehicleType.insert({"name": "12 Wheel Truck"});





