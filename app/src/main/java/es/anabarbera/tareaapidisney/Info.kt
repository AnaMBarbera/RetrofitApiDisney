package es.anabarbera.tareaapidisney

data class Info(
    val count: Int,
    val nextPage: String,
    val previousPage: Any,
    val totalPages: Int
)