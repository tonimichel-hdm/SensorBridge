p a c k a g e   o r g . t o n i m i c h e l h d m . S e n s o r B r i d g e ;  
    
 i m p o r t   o r g . a p a c h e . c o r d o v a . C a l l b a c k C o n t e x t ;  
 i m p o r t   o r g . a p a c h e . c o r d o v a . C o r d o v a P l u g i n ;  
 i m p o r t   o r g . a p a c h e . c o r d o v a . a p i . P l u g i n R e s u l t ;  
  
 i m p o r t   o r g . j s o n . J S O N O b j e c t ;  
 i m p o r t   o r g . j s o n . J S O N A r r a y ;  
 i m p o r t   o r g . j s o n . J S O N E x c e p t i o n ;  
  
 i m p o r t   a n d r o i d . a p p . A c t i v i t y ;  
 i m p o r t   a n d r o i d . c o n t e n t . I n t e n t ;  
  
 i m p o r t   a n d r o i d . h a r d w a r e . S e n s o r ;  
 i m p o r t   a n d r o i d . h a r d w a r e . S e n s o r M a n a g e r ;  
  
 p u b l i c   c l a s s   S e n s o r B r i d g e   e x t e n d s   C o r d o v a P l u g i n   {  
  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   A C T I O N _ G E T _ S E N S O R L I S T   =   " g e t S e n s o r L i s t " ;  
 	 p u b l i c   s t a t i c   f i n a l   S t r i n g   A C T I O N _ G E T _ E C H O   =   " g e t E c h o " ;  
 	  
 	 @ O v e r r i d e  
 	 p u b l i c   b o o l e a n   e x e c u t e   (   S t r i n g   a c t i o n ,   J S O N A r r a y   a r g s ,   C a l l b a c k C o n t e x t   c a l l b a c k C o n t e x t )   t h r o w s   J S O N E X c e p t i o n   {  
 	 	 i f ( A C T I O N _ G E T _ E C H O . e q u a l s ( a c t i o n ) ) {  
 	 	 	 S t r i n g   m e s s a g e   =   a r g s . g e t S t r i n g ( 0 ) ;  
 	 	 	 t h i s . e c h o ( m e s s a g e ) ;  
 	 	 	 r e t u r n   t r u e ;  
 	 	 }  
 	 	 r e t u r n   f a l s e ;  
 	 }  
 	  
 	 p r i v a t e   v o i d   e c h o ( S t r i n g   m e s s a g e ,   C a l l b a c k C o n t e x t   c a l l b a c k C o n t e x t )   {  
 	 	 i f (   m e s s a g e   ! =   n u l l   & &   m e s s a g e . l e n g t h ( )   >   0 )   {  
 	 	 	 c a l l b a c k C o n t e x t . s u c c e s s ( m e s s a g e   +   " . .   W o w   t h a t   w o r k e d " ) ;  
 	 	 }  
 	 	 c a l l b a c k C o n t e x t . e r r o r ( " E x p e c t e d   n o n - e m p t y   s t r i n g   a r g u m e n t " ) ;  
 	 }  
 	  
 } 