package regalowl.hyperconomy.inventory;

public enum HItemMetaType {
	BOOK,ENCHANTMENT_STORAGE,FIREWORK,FIREWORK_EFFECT,ITEM,LEATHER_ARMOR,MAP,POTION,SKULL,BANNER,CROSSBOW,KNOWLEDGEBOOK,SUSPICIOUS,TROPICAL_FISH;
	
	
	
	public static HItemMetaType fromString(String type) {
		if (type == null) return null;
		type = type.toUpperCase();
		if (type.equals("BOOK")) {
			return BOOK;
		} else if (type.equals("ENCHANTMENT_STORAGE")) {
			return ENCHANTMENT_STORAGE;
		} else if (type.equals("FIREWORK")) {
			return FIREWORK;
		} else if (type.equals("FIREWORK_EFFECT")) {
			return FIREWORK_EFFECT;
		} else if (type.equals("ITEM")) {
			return ITEM;
		} else if (type.equals("LEATHER_ARMOR")) {
			return LEATHER_ARMOR;
		} else if (type.equals("MAP")) {
			return MAP;
		} else if (type.equals("POTION")) {
			return POTION;
		} else if (type.equals("SKULL")) {
			return SKULL;
		} else if (type.equals("BANNER")) {
			return BANNER;
		} else if (type.equals("CROSSBOW")) {
			return CROSSBOW;
		} else if (type.equals("KNOWLEDGEBOOK")) {
			return KNOWLEDGEBOOK;
		} else if (type.equals("SUSPICIOUS")) {
			return SUSPICIOUS;
		} else if (type.equals("TROPICAL_FISH")) {
			return TROPICAL_FISH;
		} else {
			return null;
		}
	}
	
}
