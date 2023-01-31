# EV Madhyam (under developement)
### About

It privide public API for EV charging locations and new EV models in India. This GitHub repo provides developers with access to a comprehensive database for integration into their apps. It helps users find nearby charging stations, check charging port availability and stay updated on new EV models in India. 

### Documentation

#### GET

All available location of Electric Charging station.
```shell
GET http://api.evmadhyam.live/api/v1/location
```
Specific state charging location
```shell
GET http://api.ev.madhyam.live/api/v1/location?state="West Bengal"
```
Find nearest charging station
```shell
GET http://api.evmadhyam.live/api/v1/location?pincode="700001"
```
#### POST
Sign-up new user
```shell
POST http://api.evmadhyam.live/api/v1/account/signup/username="Anindra"&password="8ch98d3hshds"
```
Login new user
```shell
POST http://api.evmadhyam.live/api/v1/account/login/username="Anindra"&password="8ch98d3hshds"
```

| Veriables    | DataType | Value                                           |
|--------------|----------|-------------------------------------------------|
| id           | long     | Auto increment                                  |
| address      | String   | full address of charging location               |
| city         | String   | available city                                   |
| availability | boolean  | now availabel or not                            |
| isValidByGov | boolean  | Charging station is valided by Government or not |
| latitude     | double   | location latitide                               |
| longitude    | double   | location longitude                              |
| name         | String   | name of the charging station                    |
| zipcode      | long     | zipcode of charging station                     |
| price        | string   | price free or not                               |
| state        | String   | State of charging location                      |


### TODO

- [ ] Add car data
- [ ] Implement caching
- [ ] Implement GitHub action for auto testing
- [ ] Make CI/CD to Azure for auto deployment
- [ ] Add token base authentication
- [ ] Make API more developer friendly
- [ ] And many more

### Contributors

* Anindra Karmakar GitHub: @meanindra
* 
### Thanks

1. GitHub student development pack
2. 1 year fee Azure for student
3. 1 year free Intellij IDEA Unlimited and DataGrip for student

### Licence
<center>

```md
Apache License
Version 2.0, January 2004
http://www.apache.org/licenses/
```

</center>
