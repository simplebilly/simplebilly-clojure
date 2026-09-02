(ns simple-billy-api.specs.institute-profile
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.institute-type :refer :all]
            )
  (:import (java.io File)))


(def institute-profile-data
  {
   (ds/opt :instituteType) institute-type-spec
   (ds/opt :kapitalmarktorientiert) boolean?
   })

(def institute-profile-spec
  (ds/spec
    {:name ::institute-profile
     :spec institute-profile-data}))
