(ns simple-billy-api.specs.quota-override
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.quota-override-features :refer :all]
            )
  (:import (java.io File)))


(def quota-override-data
  {
   (ds/opt :features) quota-override-features-spec
   (ds/opt :max_connectors) int?
   (ds/opt :max_invoices_per_month) int?
   (ds/opt :max_users) int?
   (ds/opt :metered) (s/map-of string? int?)
   (ds/opt :plan) string?
   })

(def quota-override-spec
  (ds/spec
    {:name ::quota-override
     :spec quota-override-data}))
