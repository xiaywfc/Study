import hudson.model.*;
import groovy.json.*;

def find_files(filetype) {
	
	def files = findFiles(glob:filetype)
	for (file in files) {
		println file.name
	}
}
 
return this;
