package es.anabarbera.tareaapidisney

import retrofit2.http.GET
import retrofit2.Response
interface ServicioApi {
    @GET("/character")
    /*Para que una corutina funcione, es obligatorio poner suspend primero*/
    suspend fun conseguirLista(
        //No necesitamos las @Query porque el plugin ya las contempla
    ):Response<PersonajesDisney>
}