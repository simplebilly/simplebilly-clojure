(ns simple-billy-api.specs.institute-status
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.institute-check-item :refer :all]
            [simple-billy-api.specs.institute-deadlines :refer :all]
            )
  (:import (java.io File)))


(def institute-status-data
  {
   (ds/req :checklist) (s/coll-of institute-check-item-spec)
   (ds/req :deadlines) institute-deadlines-spec
   (ds/req :instituteType) string?
   (ds/req :kapitalmarktorientiert) boolean?
   })

(def institute-status-spec
  (ds/spec
    {:name ::institute-status
     :spec institute-status-data}))
