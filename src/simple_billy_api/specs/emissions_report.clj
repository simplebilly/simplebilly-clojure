(ns simple-billy-api.specs.emissions-report
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.category-total :refer :all]
            [simple-billy-api.specs.scope-total :refer :all]
            [simple-billy-api.specs.year-total :refer :all]
            [simple-billy-api.specs.data-quality :refer :all]
            [simple-billy-api.specs.target-progress :refer :all]
            )
  (:import (java.io File)))


(def emissions-report-data
  {
   (ds/req :by_category) (s/coll-of category-total-spec)
   (ds/req :by_scope) (s/coll-of scope-total-spec)
   (ds/req :by_year) (s/coll-of year-total-spec)
   (ds/req :data_quality) data-quality-spec
   (ds/opt :intensity_per_employee) float?
   (ds/opt :intensity_per_revenue_mio) float?
   (ds/opt :net_revenue) float?
   (ds/opt :spend_based_estimate_tco2e) float?
   (ds/req :targets) (s/coll-of target-progress-spec)
   (ds/req :total_tco2e) string?
   })

(def emissions-report-spec
  (ds/spec
    {:name ::emissions-report
     :spec emissions-report-data}))
