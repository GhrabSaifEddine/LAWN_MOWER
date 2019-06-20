package com.lawnmower.LawnMower.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * 
 * @author GHRAB Saif
 *
 *         18 juin 2019
 */
@Data
public class Lawn {
	Integer abs = 0;
	Integer ord = 0;
	List<Mower> mowersList = new ArrayList<>();
}
