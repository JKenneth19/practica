package com.practica04.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "practica04-aab1f.appspot.com";

    //Esta es la ruta básica de este proyecto 
    final String rutaSuperiorStorage = "Practica";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "practica04-aab1f-firebase-adminsdk-89bf4-0e7fb331bb";
}