(print (apply 'append '((a) (b))))
(print (funcall 'append '(a) '(b)))
(print (funcall 'apply 'append '((a) (b))))
(print (funcall 'append '(apply) '(a b)))
