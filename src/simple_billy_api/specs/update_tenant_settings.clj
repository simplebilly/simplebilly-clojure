(ns simple-billy-api.specs.update-tenant-settings
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [simple-billy-api.specs.company-type :refer :all]
            [simple-billy-api.specs.partial-feature-settings :refer :all]
            )
  (:import (java.io File)))


(def update-tenant-settings-data
  {
   (ds/req :companyType) company-type-spec
   (ds/opt :features) partial-feature-settings-spec
   })

(def update-tenant-settings-spec
  (ds/spec
    {:name ::update-tenant-settings
     :spec update-tenant-settings-data}))
