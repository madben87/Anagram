package com.ben.utils

class StringUtil {

    companion object {
        @JvmStatic fun anagram(input: String): String {
            val splitted = input.split("\\s".toRegex())
            val outputBuf = StringBuilder()

            val iter = splitted.iterator()

            iter.forEach {
                val charArr = it.toCharArray()
                var x = 0
                var y = charArr.size-1
                while (x < y) {
                    if (charArr[x].isLetter() && charArr[y].isLetter()) {
                        val buff = charArr[x]
                        charArr[x] = charArr[y]
                        charArr[y] = buff
                        x++
                        y--
                    } else if (!charArr[x].isLetter()) {
                        x++
                    } else if (!charArr[y].isLetter()) {
                        y--
                    } else {
                        x++
                        y--
                    }
                }

                outputBuf.append(charArr)
                outputBuf.append(" ")
            }

            return outputBuf.toString().trim()
        }
    }
}