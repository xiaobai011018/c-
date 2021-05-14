//public void removeAllKey(int key) {
//        Node cur = this.head;
//        while (cur != null ) {
//        if (cur.val == key) {
//        //说明cur所值的节点 就是要删除的节点
//        if (cur == this.head) {
//            head = head.next;
//            cur = head;
//            head.prev = null;
//
//        } else {
//            if(cur.next==null){
//                cur = cur.prev;
//                last = cur;
//                last.next = null;
//            }else{
//                cur.prev.next = cur.next;
//                cur.next.prev = cur.prev;
//        }
//        //中间或者尾巴位置
//        }
//        } else {
//        cur = cur.next;
//        }
//        }
//}
//public void clear() {
//        cur = this.head;
//        curNext = this.head;
//        while(cur!=null){
//            curNext = curNext.next;
//            cur.pre = null;
//            cur.next = null;
//            cur = curNext;
//        }
//}