# Crop-Recommender
A mobile application involving machine learning to recommend crop variety  and also predict crop yeild.The system aims to help farmers to cultivate proper crop for better yield production. To be precise and accurate in predicting crops, the project analyze the nutrients present in the soil and the crop productivity based on location.<br>
Dataset will then trained by learning networks. It compares the accuracy obtained by different network learning techniques and the most accurate result will be delivered to the end user.So, the aim of our project is to predict the amount of crop yield in a desired area in a ratio of tons per hectare. This project is useful for owners of farms (specifically) and as well as to the new generation of the farmers who are willing to use new methodologies for farming.

## Getting Started
The user just has to pass some parameters and submit it.The random forest algorithm is used to predict the crop yield and neural network algorithm  is used for crop recommendation to the users. The users can open their app to view recommended crops and weather and government schemes provided to them.This application is very useful in terms of its applications as it provides both recommendation as well as the feature to be notified about weather forecast.

## Prerequisites
- Android Studio 2.3 or more

## Features
- Provides an insights of crop yield production to the farmers by predicting the outcome of the crop on various input factors.
- Recommend crop varieties suitable a particular land using machine learning algorithm.
- Also provides 7 day weather forecast.
- Uses Azure Machine Learning Webservice as backend.
# Data Understanding
## Crop Data
The data refers to district wise, crop wise, season wise and year wise data on crop covered area and production. The data is being used to study and analyse crop production, production contribution to district/State/country, Agro-climatic zone wise performance, and high yield production order for crops, crop growing pattern and diversification.

Dataset link: https://data.gov.in/resources/district-wise-season-wise-crop-production-statistics-1997
## Data Modeling
Prediction models used :
-	Random Forest Regressor (For predicting crop yield).
-	Multi Class Neural Network (For predicting crop variaties). 

## Built With
-	Android Studio - The mobile framework used
-	Maven - Dependency Management
-	Azure – Cloud Service Provider ( Used to generate web service)
## Permissions required for the application
This app requires the following permissions:
-	Full Network Access.
-	View Network Connections.
-	Read and write access to external storage.
## Further Work
-	Quantify recommendations for varieties: Currently the direction in which the factors affect yield is available. I would like to quantify these effects and hopefully give more precise recommendations.
-	Incorporate more weather variables: Temperature, humidity, hours of sunlight.
-	Incorporate soil data.
-	Gather location-based variety data for recommendations: If all the varieties can be tested at the different locations, then varieties for which there wasn't data before can be recommended to particular locations.
-	Attempt to use mixed models (treating some predictors as random variables).

