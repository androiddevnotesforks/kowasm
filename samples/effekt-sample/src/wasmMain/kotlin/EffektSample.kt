/*
 * Copyright 2023 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import kotlinx.browser.document

import org.w3c.dom.HTMLInputElement
import org.w3c.dom.events.Event
import reactivity.computed
import reactivity.ref
import reactivity.watchEffect

data class Person(val name: String, val age: Int)

fun main() {
    var person by ref(Person("Sébastien", 41))
    document.getElementById("person-name-input")!!.addEventListener("keyup", {
        person = person.copy(name = (it.target as HTMLInputElement).value)
    })
    document.getElementById("person-age-input")!!.addEventListener("keyup", { it: Event ->
        person = person.copy(age = (it.target as HTMLInputElement).value.toInt())
    })
    val message by computed { "Hello! My name is <mark>${person.name}</mark>. I'm <mark>${person.age}</mark> years old." }
    watchEffect {
        document.getElementById("message")?.innerHTML = message
    }
}