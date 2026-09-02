(ns simple-billy-api.specs.product-category-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-category-create-data
  {
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :parentCategoryId) string?
   (ds/req :sortOrder) int?
   })

(def product-category-create-spec
  (ds/spec
    {:name ::product-category-create
     :spec product-category-create-data}))
