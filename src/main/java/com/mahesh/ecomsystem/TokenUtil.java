package com.mahesh.ecomsystem;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class TokenUtil {
	private final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
	//String generateToken(String username)
	public String generateToken(String username) {
		return Jwts.builder()
				.setSubject(username)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) //1 hour
				.signWith(key)
				.compact();
	}
	
	//String extractUsername(String token)
	public String extractUsername(String token) {
        return Jwts.parserBuilder().setSigningKey(key).build()
                .parseClaimsJws(token).getBody().getSubject();
    }
	
	//boolean validateToken(String token)
	public boolean validateToken(String token) {
		try {
            Jwts.parserBuilder().setSigningKey(key).build()
            	.parseClaimsJws(token);
            return true;
        } catch (JwtException e) {
            return false;
        }
	}
}
