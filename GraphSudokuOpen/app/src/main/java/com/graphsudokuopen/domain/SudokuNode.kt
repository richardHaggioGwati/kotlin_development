package com.graphsudokuopen.domain

import java.io.Serializable

/**
 * A node in a sudoku puzzle is donated by:
 * - A value or color, which is an integer denoted by a set of all number in a sudoku game
 *
 * A list of relative x an dy values where:
 * - top left = x0, y0 (assuming 0 based indexing)
 * - bottom right = xn-1, yn-1, where n is the largest integer in allowed game
 * */

data class SudokuNode(
    val x: Int,
    val y : Int,
    var color: Int = 0,
    var readOnly: Boolean = true,
): Serializable {
    override fun hashCode(): Int {
        return getHash(x, y)
    }
}

/**
 * Generate unique identifier
 * */
internal fun getHash(x: Int, y: Int): Int {
val newX = x*100
    return "$newX$y".toInt()
}