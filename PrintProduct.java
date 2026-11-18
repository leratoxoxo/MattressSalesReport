public class PrintProduct {
    private Product product;
    public PrintProduct(Product product) {
        this.product = product;
    }
    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: "
                + product.GetTotalProductsSold());
    }
    public void printAverageProductSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n",
                product.GetAverageProductSold());
    }
    public void printMostPopularProduct() {
        System.out.println("MOST POPULAR PRODUCT: "
                + product.GetMostPopularProduct());
    }
}