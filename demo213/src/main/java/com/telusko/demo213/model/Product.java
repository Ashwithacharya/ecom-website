package com.telusko.demo213.model;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String description;
	private String brand;
	private BigDecimal price;
	private String category;
	
	private Date releaseDate;//@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
	private boolean available;
	private int Quantity;
	private String imageName;
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public byte[] getImageDate() {
		return imageDate;
	}
	public void setImageDate(byte[] imageDate) {
		this.imageDate = imageDate;
	}
	public Product(int id, String name, String description, String brand, BigDecimal price, String category,
			Date releaseDate, boolean available, int quantity, String imageName, String imageType, byte[] imageDate) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.brand = brand;
		this.price = price;
		this.category = category;
		this.releaseDate = releaseDate;
		this.available = available;
		Quantity = quantity;
		this.imageName = imageName;
		this.imageType = imageType;
		this.imageDate = imageDate;
	}
	public Product()
	{
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public int getQuantity() {
		return Quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", brand=" + brand + ", price="
				+ price + ", category=" + category + ", releaseDate=" + releaseDate + ", available=" + available
				+ ", Quantity=" + Quantity + ", imageName=" + imageName + ", imageType=" + imageType + ", imageDate="
				+ Arrays.toString(imageDate) + "]";
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	private String imageType;
	@Lob
	private byte[] imageDate;
	
	

}
