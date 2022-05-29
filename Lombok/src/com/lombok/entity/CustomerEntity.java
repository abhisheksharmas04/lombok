package com.lombok.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor(access = AccessLevel.PROTECTED)
@NoArgsConstructor
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class CustomerEntity {
	
	@NonNull
	private int cno;
	@NonNull
	private String cname;
	@NonNull
	private String cadd;
	private float billAmnt;

}
