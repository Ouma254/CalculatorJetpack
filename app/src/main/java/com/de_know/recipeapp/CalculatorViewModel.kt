package com.de_know.recipeapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel: ViewModel() {

    var state by mutableStateOf(CalculatorState())
        private set

    fun onAction(action: CalculatorActions) {
        when (action) {
            is CalculatorActions.Number -> enterNumber(action.number)
            is CalculatorActions.Decimal -> enterDecimal()
            is CalculatorActions.Clear -> state = CalculatorState()
            is CalculatorActions.Operations -> enterOperation(action.operation)
            is CalculatorActions.Calculate -> performCalculation()
            is CalculatorActions.Delete -> performDeletion()


        }

    }

    private fun performDeletion() {
        when {
            state.number2.isNotBlank() -> state = state.copy(number2 = state.number2.dropLast(1))
            state.operation != null -> state = state.copy(operation = null)
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )

        }

        private fun enterOperation(operation: CalculatorOperations.Division) {
            if (state.number1.isNotBlank()) {
                state = state.copy(operation = operation)
            }

        }

        fun enterDecimal() {
            if (state.operation == null && !state.number1.contains(".") && state.number1.isNotBlank()) {
                state = state.copy(
                    number1 = state.number1 + "."
                )
                return
            }
            if (!state.number2.contains(".") && state.number2.isNotBlank()) {
                state = state.copy(
                    number1 = state.number2 + "."
                )
            }
        }

        private fun enterNumber(number: Int) {

        }
    }
}