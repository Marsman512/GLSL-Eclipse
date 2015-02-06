package org.johnnei.glsl.editor;

public class Glsl {

	public static final String[] KEYWORDS = {
		"break",
		"continue",
		"do",
		"default",
		"else",
		"for",
		"if",
		"return",
		"switch",
		"void",
		"while",
	};
	
	public static final String[] PREPROCESSORS = {
		"#define",
		"#elif",
		"#else",
		"#endif",
		"#error",
		"#extension",
		"#if",
		"#ifdef",
		"#ifndef",
		"#line",
		"#pragma",
		"#undef",
		"#version",
	};
	
	public static final String[] TYPES = {
		// Float types
		"float",
		"vec2",
		"vec3",
		"vec4",
		"mat2",
		"mat2x2",
		"mat2x3",
		"mat2x4",
		"mat3",
		"mat3x2",
		"mat3x3",
		"mat3x4",
		"mat4",
		"mat4x2",
		"mat4x3",
		"mat4x4",
		
		// Double types
		"double",
		"dvec2",
		"dvec3",
		"dvec4",
		"dmat2",
		"dmat2x2",
		"dmat2x3",
		"dmat2x4",
		"dmat3",
		"dmat3x2",
		"dmat3x3",
		"dmat3x4",
		"dmat4",
		"dmat4x2",
		"dmat4x3",
		"dmat4x4",
		
		// signed int types
		"int",
		"ivec2",
		"ivec3",
		"ivec4",
		
		// unsigned int types
		"uint",
		"uvec2",
		"uvec3",
		"uvec4",
		
		// boolean types
		"bool",
		"bvec2",
		"bvec3",
		"bvec4",
		
		// floating point opaque types
		"sampler1D",
		"sampler2D",
		"sampler3D",
		"samplerCube",
		"sampler2DRect",
		"sampler1DArray",
		"sampler2DArray",
		"samplerBuffer",
		"sampler2DMS",
		"sampler2DMSArray",
		"samplerCubeArray",
		"image1D",
		"image2D",
		"image3D",
		"imageCube",
		"image2DRect",
		"image1DArray",
		"image2DArray",
		"imageBuffer",
		"image2DMS",
		"image2DMSArray",
		"imageCubeArray",
		"sampler1DShadow",
		"sampler2DShadow",
		"sampler2DRectShadow",
		"sampler1DArrayShadow",
		"sampler2DArrayShadow",
		"samplerCubeShadow",
		"samplerCubeArrayShadow",
		
		// Signed integer opaque types
		"isampler1D",
		"isampler2D",
		"isampler3D",
		"isamplerCube",
		"isampler2DRect",
		"isampler1DArray",
		"isampler2DArray",
		"isamplerBuffer",
		"isampler2DMS",
		"isampler2DMSArray",
		"isamplerCubeArray",
		"iimage1D",
		"iimage2D",
		"iimage3D",
		"iimageCube",
		"iimage2DRect",
		"iimage1DArray",
		"iimage2DArray",
		"iimageBuffer",
		"iimage2DMS",
		"iimage2DMSArray",
		"iimageCubeArray",
		
		// unsigned integer opaque types
		"atomic_unit",
		"usampler1D",
		"usampler2D",
		"usampler3D",
		"usamplerCube",
		"usampler2DRect",
		"usampler1DArray",
		"usampler2DArray",
		"usamplerBuffer",
		"usampler2DMS",
		"usampler2DMSArray",
		"usamplerCubeArray",
		"uimage1D",
		"uimage2D",
		"uimage3D",
		"uimageCube",
		"uimage2DRect",
		"uimage1DArray",
		"uimage2DArray",
		"uimageBuffer",
		"uimage2DMS",
		"uimage2DMSArray",
		"uimageCubeArray",
	};
	
	public static final String[] QUALIFIERS = {
		// Storage
		"const",
		"in",
		"out",
		"uniform",
		"buffer",
		"shared",
		
		// Auxiliary Storage
		"centroid",
		"sampler",
		"patch",
		
		// Precision
		"highp",
		"mediump",
		"lowp",
		"precision",
		
		// Invariant
		"invariant",
		
		// Memory
		"coherent",
		"volatile",
		"restrict",
		"readonly",
		"writeonly",
	};

}
