# Autor: jose
@Stories
Feature: Prestamo de auto
  Como usuario necesito poder hacer un prestamo de auto

  Scenario: validar que se pueda descargar el PDF de manera correcta
    Given que yo ingreso a la url del sistema banistmo
    When  yo hago clic en la opción productos y servicios y luego hago clic en prestamos y luego hago clic en la opcion de pretsamos de auto y luego hago clic en la opcion de tasas y tarifas y hago clic en la opcion del pdf prohibiciones
    Then  debo visualizar que se abra un pdf en otra pestaña y diga prohibiciones @Scenario