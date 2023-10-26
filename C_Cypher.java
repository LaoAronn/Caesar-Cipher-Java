private static String encryptText(String message, int key){
	    
    String encryptedText = "";
    
    int letterToEncrypt = 0;
    int letterExcess = 0;
    
    for (int i = 0; i < message.length(); i++){
        letterToEncrypt = message.charAt(i);
        
        if ( Character.isLetter(letterToEncrypt) ) {
            
            // Checking if the character is capital or lower case
            if ((int)letterToEncrypt < (int)'z' && (int)letterToEncrypt > (int)'a'){ 
                
                // If it goes overboard
                if ( letterToEncrypt + key > (int)'z'){
                    // Get the amount to shift starting from a
                    letterExcess = (letterToEncrypt + key - 1) - 'z';
                    encryptedText += (char)(letterExcess + 'a');
                } else { // If its not over 'z'
                    encryptedText += (char)(letterToEncrypt + key);
                }
                

            } else { // Else it is a capital character
                
                // If it goes overboard
                if ( letterToEncrypt + key > (int)'Z'){
                    // Get the amount to shift starting from a
                    letterExcess = (letterToEncrypt + key - 1) - 'Z';
                    encryptedText += (char)(letterExcess + 'A');
                } else { // If its not over 'z'
                    encryptedText += (char)(letterToEncrypt + key);
                }
                
            }
            
        } else {
            encryptedText += message.charAt(i);
        }
        
    }
    
    return encryptedText;
    
}



private static String eliminateSameChar(String message, String charToRemove){
    String result = "";
    String messageCharacter;
    
    // Eliminating the words
    for(int i = 0; i < message.length(); i++){
        
        // If its not in the list of character to be removed
        messageCharacter = ""+message.charAt(i);
        if ( ! charToRemove.contains(messageCharacter) ){
            result += message.charAt(i);
        }
        
    }
    
    return result;
}
