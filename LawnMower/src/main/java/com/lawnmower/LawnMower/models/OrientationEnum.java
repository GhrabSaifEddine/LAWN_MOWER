package com.lawnmower.LawnMower.models;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
/**
 * 
 * @author GHRAB Saif
 *
 * 18 juin 2019
 */
public enum OrientationEnum {

	/* North */
	N,
	/* South */
	S,
	/* East */
	E,
	/* West */
	W;

	/**
	 * 
	 * @return list of Strings
	 */
	public static List<String> getValues() {
		return Stream.of(OrientationEnum.values()).map(OrientationEnum::name).collect(Collectors.toList());
	}

}