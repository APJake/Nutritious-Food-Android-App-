package com.apjake.nutriousfood

class Test {
    val client = OkHttpClient()

    val request = Request.Builder()
        .url("https://spoonacular-recipe-food-nutrition-v1.p.rapidapi.com/recipes/complexSearch?maxVitaminB1=1000&minPotassium=0&minIron=0&maxVitaminB5=1000&minCalcium=0&minFolicAcid=0&maxSugar=1000&limitLicense=false&maxVitaminB2=1000&maxVitaminB6=1000&maxSodium=1000&minFolate=0&minVitaminK=0&minFluoride=0&maxVitaminB12=1000&instructionsRequired=false&maxVitaminA=5000&ranking=2&addRecipeInformation=false&number=10&minZinc=0&maxVitaminK=1000&maxMagnesium=1000&offset=0&maxManganese=1000&maxFluoride=1000&maxSelenium=1000&minProtein=5&minAlcohol=0&minCalories=150&minCholine=0&maxIodine=1000&maxCopper=1000&minFat=5&minVitaminD=0&maxCholine=1000&excludeIngredients=coconut%2C%20mango&maxIron=1000&diet=null&maxCholesterol=1000&minSelenium=0&minVitaminB1=0&minVitaminB6=0&maxPotassium=1000&intolerances=peanut%2C%20shellfish&maxFat=100&minVitaminC=0&includeIngredients=onions%2C%20lettuce%2C%20tomato&author=null&maxPhosphorus=1000&maxFolate=1000&minMagnesium=0&maxCaffeine=1000&minSaturatedFat=0&maxVitaminE=1000&minSodium=0&maxVitaminC=1000&minVitaminA=0&minVitaminB3=0&type=main%20course&maxSaturatedFat=50&minCholesterol=0&fillIngredients=false&minFiber=0&maxCarbs=100&minVitaminB12=0&maxAlcohol=1000&maxCalories=1500&maxCalcium=1000&maxZinc=1000&minPhosphorus=0&maxVitaminB3=1000&minVitaminE=0&maxVitaminD=1000&maxProtein=100&minCarbs=5&maxFiber=1000&minCopper=0&minCaffeine=0&minVitaminB5=0&query=burger&cuisine=american&minManganese=0&minSugar=0&minIodine=0&minVitaminB2=0&maxFolicAcid=1000&equipment=pan&excludeCuisine=greek")
        .get()
        .addHeader("X-RapidAPI-Host", "spoonacular-recipe-food-nutrition-v1.p.rapidapi.com")
        .addHeader("X-RapidAPI-Key", "f6f2ba9b14msh8179da8f54ada96p12656bjsn036f877971c9")
        .build()

    val response = client.newCall(request).execute()
}