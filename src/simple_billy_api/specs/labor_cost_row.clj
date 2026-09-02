(ns simple-billy-api.specs.labor-cost-row
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def labor-cost-row-data
  {
   (ds/req :cost) string?
   (ds/opt :employeeId) uuid?
   (ds/req :groupKey) string?
   (ds/req :hours) string?
   (ds/opt :name) string?
   })

(def labor-cost-row-spec
  (ds/spec
    {:name ::labor-cost-row
     :spec labor-cost-row-data}))
