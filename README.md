### Scheme instance Get all available Electric Vehicle Available schemes in India 
```shell
GET https://evmadhyam.live/scheme
```

Get scheme by id
```shell
GET https://evmadhyam.live/scheme/12
```

Search available schemes related keywords
```shell
GET https://evmadhyam.live/scheme/search?query=kolkata
```

### Available car instance

See all available cars in India
```shell
GET https://evmadhyam.live/car
```

Find a car by id
```shell
GET https://evmadhyam.live/car/23
```

Search cars by car model name
```shell
GET https://evmadhyam.live/car/search?name=tiyago
```

Search car with available seats
```shell
GET https://evmadhyam.live/car/seats=4
```

Get all cars with same origin location
```shell
GET https://evmadhyam.live/car/origin=India
```

### Charging location instance


Get all charging location details
```shell
GET https://evmadhyam.live/location/
```

Find charging location by there id
```shell
GET https://evmadhyam.live/location/id=23
```

Find a charging location on geo-map by there latitude and longitude
```shell
GET https://evmadhyam.live/location/latlng=40.714224,-73.961452
```

Find available charging location in given zipcode
```shell
GET https://evmadhyam.live/location/pincode=700001
```

Find nearest charging location by given zipcode
```shell
GET https://evmadhyam.live/location/search?nearest=700003
```

Show the payment methods
```shell
GET https://evmadhyam.live/location/latlng=40.714224,-73.961452&&payment-method=UPI
```
