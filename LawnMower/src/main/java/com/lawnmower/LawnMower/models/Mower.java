package com.lawnmower.LawnMower.models;

import lombok.Data;
/**
 * 
 * @author GHRAB Saif
 *
 * 18 juin 2019
 */
@Data
public class Mower {
	Integer posX=0;
    Integer posY=0;
    Character orientation;
    String path;
}
