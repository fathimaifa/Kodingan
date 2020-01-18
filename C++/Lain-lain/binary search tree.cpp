#include <iostream>
#include <cstdlib>

using namespace std;

class BinarySearchTree{
private:
	struct tree_node {
		tree_node *left;
		tree_node *right;
		int data;
	};

	tree_node *root;

public:
	BinarySearchTree(){
		root=NULL;
	}

	bool isEmpty() const
	{return root==NULL;}

	void print_inorder();
	void inorder(tree_node *);
	void print_preorder();
	void print(tree_node *);
	void print_postorder();
	void postorder(tree_node *);
	void insert(int);
	void remote(int);
};

//smaller elements go left
//larger elements go right
void BinarySearchTree::insert(int d){

}tree_node 