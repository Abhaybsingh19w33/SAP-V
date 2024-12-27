import com.sap.gateway.ip.core.customdev.util.Message;
import java.util.*;
import com.sap.it.api.mapping.*;
public String getDeptCode(String s){
	if((s.indexOf("N/A") == -1) & (s.indexOf("(") != -1) & (s.indexOf(")") != -1))
		return s.substring(s.indexOf('(')+1, s.indexOf(')'));
	else
		return s;
}