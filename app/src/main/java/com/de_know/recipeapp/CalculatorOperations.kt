package com.de_know.recipeapp

sealed class CalculatorOperations (val symbol: String) {
    // create the objects of the above sealed
    object Add: CalculatorOperations("+")
    object Subtraction: CalculatorOperations("-")
    object Division: CalculatorOperations("/")
    object Multiplication: CalculatorOperations("x")
}
