/*
 * Copyright 2010-2013 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package kara.js


import js.dom.html.*
import js.dom.core.*

fun main(args: Array<String>) {
    appendText("Hello")
    appendText("Hello2")
}

public inline fun <T, R> with(receiver: T, f: T.() -> R) : R = receiver.f()

fun appendText(text: String) {
    (window.document.getElementById("mainDiv")!! as HTMLElement).innerHTML += text + "<br>"
}