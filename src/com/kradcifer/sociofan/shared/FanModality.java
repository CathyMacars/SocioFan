package com.kradcifer.sociofan.shared;

public enum FanModality {
	
	TRADITIONAL("Tradicional"),
	STUDENT("Estudante"),
	MINOR("Menor"),
	M_MINOR("Mirim"),
	ALVINEGRO("Alvinegro"),
	WOMAN("Mulher"),
	STUDANT_WOMAN("Mulher estudante"),
	MINOR_WOMAN("Mulher menor"),
	STANDARD("Comum");
	
	public final String label;

	private FanModality(String _Label) {
		label = _Label;
	}
	
}
