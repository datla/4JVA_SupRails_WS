/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.supinfo.suprails.entity;

/**
 *
 * @author Guillaume
 */
public enum TractionType {
    
    ELECTRIC {
        @Override
        public String toString() {
            return "electric";
        }        
    },    
    DIESEL {
        @Override
        public String toString() {
            return "diesel";
        }        
    }
    
}
