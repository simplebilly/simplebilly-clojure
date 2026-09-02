(ns simple-billy-api.specs.return-logistics-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs. :refer :all]
            [simple-billy-api.specs.return-warehouse-summary :refer :all]
            )
  (:import (java.io File)))


(def return-logistics-summary-data
  {
   (ds/req :byStatus) any-type-spec
   (ds/req :byWarehouse) (s/coll-of return-warehouse-summary-spec)
   (ds/req :itemsRestocked) int?
   (ds/req :itemsScrapped) int?
   (ds/req :totalItems) int?
   (ds/req :totalReturns) int?
   })

(def return-logistics-summary-spec
  (ds/spec
    {:name ::return-logistics-summary
     :spec return-logistics-summary-data}))
