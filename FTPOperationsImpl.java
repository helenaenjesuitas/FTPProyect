package org.jesuitasrioja.ftpproject.ftpLayer;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.log4j.Logger;

public class FTPOperationsImpl implements FTPOperations {
	
	public void conectarServidorFTP() {
	}
	
	public void desconectarServidorFTP() {	
	}
	
	@Override
	public String directorioDeTrabajo() {	
	}
  
	@Override
	public Boolean cambiarDirectorioDeTrabajo(String path) {
	}

	@Override
	public Boolean subirFichero(String path) {
	}

	@Override
	public Boolean bajarFichero(String file, String path) {
	}

	@Override
	public Boolean eliminarFichero(String file) {	
	}

	@Override
	public Boolean crearCarpeta(String nombreCarpeta) {
	}

	@Override
	public Boolean eliminarCarpeta(String nombreCarpeta) {
	}

	@Override
	public List<FTPFile> listaFicherosCarpeta(String path) {
	}

	@Override
  public List<FTPFile> listaDirectoriosCarpeta(String path) {
	}

	@Override
	public void mostrarInformacionFile(FTPFile file) {
		}
