package org.nodejs

import org.nodejs.http.IncomingMessage
import org.nodejs.http.ServerResponse

open external class Readable

open external class Writable: WritableStream {
    override fun end(data: String, cb: () -> Unit)
}

external interface WritableStream {
    fun end(data: String, cb: () -> Unit = definedExternally)
}

typealias RequestListener = (req: IncomingMessage, res: ServerResponse) -> Unit

external interface Dict<T>