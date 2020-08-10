# (Ford GoBike System Data)
## by: REEM ALRASHOUD

## Dataset
----------------------------------------------------

> This dataset for Ford GoBike System year 2017 from [Here](https://s3.amazonaws.com/baywheels-data/index.html).
The Data set contains trip data of users in San Francisco Bay Area.There are 519,702 rows of trip in the dataset. Most variables are numeric in nature, but the variables user_type,end and start station names are cateogrical in nature.An important variables is the duration of the trip in seconds.

> -such of fields: Trip Duration (seconds),Start Time and Date,End Time and Date,Start Station ID,Start Station Name,Start Station Latitude,Start Station Longitude,End Station ID,End Station Name,End Station Latitude,End Station Longitude,Bike ID, User Type (Subscriber "Member" or Customer "Casual").

## Summary of Findings
----------------------------------------------------
**Univariate:**
-----------------
>In this section, investigate distributions of individual variables.I fond that  The duration frequency is decreased after a high point of values which is make a very long data tail.The most Frequency duration is around 400.Moreover, the Subscriber ( Member) user type is most popular than Customer (Casual).Also, we Find a group of the most 10 popular end station names such as : San Francisco Caltrain, San Francisco Ferry Building, The Embarcadero at Sansome St, San Francisco Caltrain Station 2, Montgomery St BART Station, Market St at 10th St, Powell St BART Station, Berry St at 4th St, Steuart St at Market St, and Powell St BART Station.All of them have a high popularity which is above 7500.in addition, I notice that the weekdays have more trips than weekends.There are some days have Equality in counts such as Wednesday and Tuesday which is above 80000.

**Bivariate:**
-----------------
>In this section, investigate relationships between pairs of variables.I fond that the Customer type has longest duration , however the subscriber has most popularity as the last analysis we did.Moreover,I notice that there are lots of negative correlation and few strong correlation.Also,There is a strong relationship between sunday and saturday with the duration that means the bike is used at high level in specific days.About the other days the Usage of bike is normal at moderate level.As we can see Sunday is around 1750 , Saturday is around 1600 , and the other weekdays are near from 1000 seconds.

**Multivariate:**
-----------------
>In this section, investigate distributions of three or more variables.we decided that the customer through all of the months has longer trips duration than subscriber.Moreover, the customer type has the longer trips duration Especially in the sunday which is around 3000. However, the subscriber it is so low and the most highest duration in sunday which less than 1000 seconds.Also,for each month there is a special day which is has the longest duration. (December->Sunday), (November->Saturday), (October->Sunday), (September->Sunday), (August->Sunday), (July->Sunday), and (June->Wednesday).

## Key Insights for Presentation
----------------------------------------------------

>The customer type has the longer trips duration Especially in the sunday which is around 3000. However, the subscriber it is so low and the most highest duration in sunday which less than 1000 seconds.And,There is a strong relationship between sunday and saturday with the duration that means the bike is used at high level in specific days.