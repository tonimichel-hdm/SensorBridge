v a r   s e n s o r b r i d g e   =   {  
 	 e c h o :   f u n c t i o n (   m s g ,   s u c c e s s C a l l b a c k ,   e r r o r C a l l b a c k   ) {  
 	 	 c o r d o v a . e x e c (  
 	 	 	 s u c c e s s C a l l b a c k ,  
 	 	 	 e r r o r C a l l b a c k ,  
 	 	 	 " S e n s o r B r i d g e " ,  
 	 	 	 " e c h o " ,  
 	 	 	 [ { " m e s s a g e " : m s g } ]  
 	 	 ) ;  
 	 }  
 }  
 m o d u l e . e x p o r t s   =   s e n s o r b r i d g e ; 