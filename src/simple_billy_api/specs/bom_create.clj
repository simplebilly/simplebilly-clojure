(ns simple-billy-api.specs.bom-create
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.bom-status :refer :all]
            )
  (:import (java.io File)))


(def bom-create-data
  {
   (ds/opt :components) any-type-spec
   (ds/opt :description) string?
   (ds/req :name) string?
   (ds/opt :outputQuantity) int?
   (ds/req :productId) uuid?
   (ds/opt :status) bom-status-spec
   })

(def bom-create-spec
  (ds/spec
    {:name ::bom-create
     :spec bom-create-data}))
