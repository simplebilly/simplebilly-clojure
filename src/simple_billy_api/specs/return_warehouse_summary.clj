(ns simple-billy-api.specs.return-warehouse-summary
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def return-warehouse-summary-data
  {
   (ds/req :itemsRestocked) int?
   (ds/req :itemsScrapped) int?
   (ds/req :returns) int?
   (ds/opt :warehouseId) string?
   })

(def return-warehouse-summary-spec
  (ds/spec
    {:name ::return-warehouse-summary
     :spec return-warehouse-summary-data}))
