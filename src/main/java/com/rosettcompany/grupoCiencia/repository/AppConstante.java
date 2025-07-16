package com.rosettcompany.grupoCiencia.repository;

public class AppConstante {

  public static class COD {
    public static final String EX_200 = "200";
    public static final String EX_400 = "400";
    public static final String EX_201 = "201";
    public static final String EX_204 = "204";
    public static final String EX_205 = "205";
    public static final String EX_206 = "206";
    public static final String EX_207 = "207";
    public static final String EX_208 = "208";

  }

  public static class MSG {
    public static final String EX_200 = "Información procesada correctamente.";
    public static final String EX_400 = "Error en el servicio.";
    public static final String EX_201 = "El registro se insertó correctamente.";
    public static final String EX_204 = "No se encontraron registros.";
    public static final String EX_205 = "Número de RUC debe tener 11 digitos.";
    public static final String EX_206 = "El servicio de SUNAT devolvió datos incompletos.";
    public static final String EX_207 = "El RUC no pertenece a la persona o no esta activo o habido.";
    public static final String EX_208 = "El RUC debe pertenecer a un extranjero.";
    public static final String EX_209 = "El Codigo de Usuario de Permiso tierra es valido.";

  }

	//PERSONA VACIO
    public static final String STR_UIDPERSONA_VACIO = "00000000-0000-0000-0000-000000000000";

  //PAIS
    public static final String STR_PAIS_ID_PERU = "PER";

	//VARIABLES AUTORIZACION
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";
    public static final String HEADER_AUTH_NAME = "Authorization";


    //TIPOS DE TRAMITE
    public static final int INT_TIPO_TRAMITE_PERMISO_TEMPORAL_PERMANENCIA_RS109 = 126;
    public static final int INT_TIPO_TRAMITE_REQUISITO_REGULARIZACION_MIGRATORIA = 113;
    public static final int INT_TIPO_TRAMITE_PERMISO_TEMPORAL_PERMANENCIA_RR = 126;
    public static final int INT_TIPO_TRAMITE_REGULARIZACION_EXTRANJEROS = 113;
    public static final int INT_ID_GRUPO_CITA_REGULARIZACION_MIGRATORIA = 6;
    public static final int INT_TIPO_TRAMITE_LOGIN_REGULARIZACION_MIGRATORIA = 109;
    public static final int INT_TIPO_TRAMITE_LOGIN_CALIDAD_HUMANITARIA = 62;
    public static final int INT_TIPO_TRAMITE_EXPEDICION_CE = 118;
    
    
    
    
    public  static  String DATE_FORMAT_DD_MM_YYYY = "dd-MM-yyyy";
    public  static  String DATE_FORMAT_YYY_MM_DD = "yyyy-MM-dd";
    public static  String VALOR_CERO="0";
    public static  int VALOR_DIEZ=10;


  public static class TIPO_CONSTANCIA {
    public static final Integer CITA_PTP = 13;
  }
  
//ESTADO CIVIL
  public static final String ESTADO_CIVIL_CASADO = "C";
  public static final String ESTADO_CIVIL_DIVORCIADO = "D";
  public static final String ESTADO_CIVIL_SOLTERO = "S";
  public static final String ESTADO_CIVIL_VIUDO = "V";
  
  
//PROFESION
  public static final String STR_PROFESION_NO_DEFINIDO = "045";
}
