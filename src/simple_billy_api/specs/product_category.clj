(ns simple-billy-api.specs.product-category
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-category-data
  {
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :parentCategoryId) string?
   (ds/req :sortOrder) int?
   })

(def product-category-spec
  (ds/spec
    {:name ::product-category
     :spec product-category-data}))
