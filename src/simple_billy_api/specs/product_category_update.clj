(ns simple-billy-api.specs.product-category-update
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def product-category-update-data
  {
   (ds/opt :description) string?
   (ds/opt :name) string?
   (ds/opt :parentCategoryId) string?
   (ds/opt :sortOrder) int?
   })

(def product-category-update-spec
  (ds/spec
    {:name ::product-category-update
     :spec product-category-update-data}))
